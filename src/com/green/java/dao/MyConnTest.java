package com.green.java.dao;

import com.green.java.dao.model.BoardDetailVo;
import com.green.java.dao.model.BoardSelDto;
import com.green.java.dao.model.BoardUpdDto;
import com.green.java.dao.model.BoardVo;

import java.util.List;

public class MyConnTest {
    public static void main(String[] args) {
        BoardDao boardDao = new BoardDao();
        int page = 2;
        int row = 30;
        int startIdx = (page - 1) * row;

        BoardSelDto dto = new BoardSelDto();
        dto.setStartIdx(startIdx);
        dto.setRow(row);

        List<BoardVo> list = boardDao.selBoard(dto);
        for(BoardVo vo : list) {
            System.out.println(vo);
        }

    }
}
