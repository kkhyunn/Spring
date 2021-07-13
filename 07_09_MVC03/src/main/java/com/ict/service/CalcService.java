package com.ict.service;

import org.springframework.stereotype.Service;

// 서비스 : DB 트랜잭션 처리, DB결과를 가공
// DAO : DB 결과
@Service("calc")
public class CalcService {
	public int plus() {
		return 5 + 3;
	}
	public int minus() {
		return 5 - 3;
	}
	public int multi() {
		return 5 * 3;
	}
	public int divide() {
		return 5 / 3;
	}
}
