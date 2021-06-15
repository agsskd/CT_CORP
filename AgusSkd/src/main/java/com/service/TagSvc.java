package com.service;

import java.util.List;
import com.dto.TagDto;

public interface TagSvc {

	public List<TagDto> getAll();
	public TagDto getOne(String id);
	public int save(TagDto tag);
	public int update(TagDto tag);
	public int delete(String tag);
}
