package hello.servlet.domain.member;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class MemberRepositoryTests {
	MemberRepository memberRepository = MemberRepository.getInstance();
	
	@AfterEach
	void afterEach() {
		memberRepository.clearStore();
	}
	
	@Test
	void save() {
		//given
		Member member = new Member("jiseong", 29);
		
		//when
		Member saveMember = memberRepository.save(member);
		
		//then
		Member findMember = memberRepository.findById(saveMember.getId());
		Assertions.assertThat(findMember).isEqualTo(saveMember);
	}
	
	@Test
	void findAll() {
		//given
		Member member1 = new Member("jiseong", 29);
		Member member2 = new Member("sara", 26);
		Member member3 = new Member("saraaaaa", 26);
		memberRepository.save(member1);
		memberRepository.save(member2);
		
		//when
		List<Member> result = memberRepository.findAll();
		
		//then
		//Assertions.assertThat(result.size()).isEqualTo(2);
		Assertions.assertThat(result).contains(member1, member2);
	}
}
