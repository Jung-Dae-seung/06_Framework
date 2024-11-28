package edu.kh.project.member.model.service;

import java.util.List;

import edu.kh.project.member.model.dto.Member;

public interface MemberService {

	/** 로그인 서비스
	 * @param inputMember
	 * @return loginMember
	 */
	Member login(Member inputMember) throws Exception;

	/** 이메일 중복검사 서비스
	 * @param memberEmail
	 * @return 중복1, 아님0
	 * @author 저자명
	 */
	int checkEmail(String memberEmail);

	/** 닉네임 중복검사 서비스
	 * @param memberNickname
	 * @return 중복1, 아님0
	 */
	int checkNickname(String memberNickname);

	/** 회원 가입 서비스
	 * @param inputMember
	 * @param memberAddress
	 * @return result
	 */
	int signup(Member inputMember, String[] memberAddress);

	/** 메인화면 회원 목록 조회
	 * @return List<Member>
	 */
	List<Member> memberList();

	/** 특정 회원 비밀번호 초기화
	 * @param memberNo
	 * @return result
	 */
	int resetPw(String memberNo);

	/** 특정 회원 탈퇴 복구
	 * @param memberNo
	 * @return result
	 */
	int restorationMember(String memberNo);

}
