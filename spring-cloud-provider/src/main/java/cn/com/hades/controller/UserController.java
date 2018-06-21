package cn.com.hades.controller;

import cn.com.hades.bean.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserController extends PagingAndSortingRepository<User, Long> {
}

