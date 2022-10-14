package com.schedulemaster.Controller;


import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;

//서버와 통신
public class DaoConnect {

    HttpURLConnection conn = null;
    BufferedReader br = null;
    OutputStreamWriter wr = null;

    // ID, PWD 일치여부 확인 -> 결과 처리
    // NAME, EMAIL 로 아이디 반환 -> 결과 처리
    // 아이디 중복 체크 -> 결과 처리
    // 회원 가입 -> 결과 처리
    // 필터링한 결과 과목들 반환 -> 결과 처리
    // 내가 신청한 과목들 반환 -> 결과 처리
    // 수강 신청 -> 결과 처리
    // 신청 취소 -> 결과 처리
    // 정보 수정 -> 결과 처리
    // 유저 정보 받기 -> 결과 처리
    // 서버에 request 보낸 후 받는 메소드
    // POST 메소드 request 후 Array 로 받는 메소드
    // GET 메소드 Array 반환 request
    //
}
