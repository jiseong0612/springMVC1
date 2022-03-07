package hello.servlet.domain.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
	private static Map<Long, Member> store = new HashMap<>();
	private static long sequence = 0L;

	private static final MemberRepository instance = new MemberRepository();

	public static MemberRepository getInstance() {
		return instance;
	}

	private MemberRepository() {
	}
}
