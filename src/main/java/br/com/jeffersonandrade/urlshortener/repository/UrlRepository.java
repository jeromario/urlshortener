package br.com.jeffersonandrade.urlshortener.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.jeffersonandrade.urlshortener.entities.UrlEntity;

public interface UrlRepository extends MongoRepository<UrlEntity, String>{

}
