package com.bandy.service;
import java.util.List;

import com.bandy.model.Resource;

public interface ResourceService {
     public Resource getResourceById(Integer id);
     public List<Resource> getShowResource(Integer type);
}
