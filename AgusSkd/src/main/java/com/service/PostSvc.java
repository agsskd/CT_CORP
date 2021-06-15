package com.service;

import java.util.List;

import com.dto.PostDto;

public interface PostSvc {

	public List<PostDto> getAll();
	public PostDto getOne(String id);
	public int save(PostDto tag);
	public int update(PostDto tag);
	public int delete(String tag);
}
