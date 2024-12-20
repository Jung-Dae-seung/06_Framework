package edu.kh.project.member.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.project.member.model.dto.Member;

@Mapper
public interface MemberMapper {

	/** 로그인 SQL 실행
	 * @param memberEmail
	 * @return
	 */
	Member login(String memberEmail) throws Exception;

	/** 이메일 중복검사
	 * @param memberEmail
	 * @return 중복1, 아님0
	 */
	int checkEmail(String memberEmail);

	/** 닉네임 중복검사
	 * @param memberNickname
	 * @return 중복1, 아님0
	 */
	int checkNickname(String memberNickname);

	/** 회원 가입 SQL 실행
	 * @param inputMember
	 * @return result
	 */
	int signup(Member inputMember);

	/** 메인화면 회운 목록 조회
	 * @return List<Member>
	 */
	List<Member> memberList();
	
	/** 특정 회원 비밀번호 초기화
	 * @param encPw
	 * @param memberNo
	 * @return result
	 */
	int resetPw(Map<String, Object> map);

	/** 특정 회원 탈퇴 복구
	 * @param memberNo
	 * @return result
	 */
	int restorationMember(String memberNo);
	


}
