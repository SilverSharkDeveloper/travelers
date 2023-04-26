package com.app.domain.DAO.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.app.domain.DTO.board.NoticeBoardDTO;
import com.app.mybatis.config.MyBatisConfig;

public class NoticeBoardDAO {
public SqlSession sqlSession;
	
	public NoticeBoardDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	public List<NoticeBoardDTO> selectNoticeBoardList(){
		return sqlSession.selectList("noticeBoard.selectNoticeBoardList");
	}
	
	
}
