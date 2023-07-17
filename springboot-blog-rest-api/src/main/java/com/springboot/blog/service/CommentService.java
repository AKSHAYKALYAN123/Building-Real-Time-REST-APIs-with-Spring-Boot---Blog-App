package com.springboot.blog.service;

import com.springboot.blog.payload.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(long postId,CommentDto commentDto);
    List<CommentDto> getAllCommentByPostId(long postId);
    CommentDto getCommentByPostId(long postId, long commentId);
    CommentDto updateComment(long  postId, long commentId,CommentDto commentRequest);
    void deleteComment(long postId,long commentId);

}
