package com.key.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by rihongo on 2017-08-29.
 */
@RepositoryRestResource
public interface MemberRepository extends PagingAndSortingRepository<Member,Long>{
}
