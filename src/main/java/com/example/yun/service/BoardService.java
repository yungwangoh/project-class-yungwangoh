package com.example.yun.service;

import com.example.yun.dto.BoardResponseDto;

import java.util.List;

public interface BoardService {

    default BoardResponseDto boardCreate(String title, String content) {
        return null;
    }

    default List<BoardResponseDto> boardAllSearch() {
        return null;
    }

    default BoardResponseDto boardSearch(Long id) {
        return null;
    }

    default BoardResponseDto boardUpdateTitle(Long id, String title) {
        return null;
    }

    default BoardResponseDto boardUpdateContent(Long id, String content) {
        return null;
    }

    default void boardDelete(Long id) {}
}
