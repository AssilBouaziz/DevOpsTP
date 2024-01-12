package com.example.publicationservice.services;

import com.example.publicationservice.dao.PublicationDao;
import com.example.publicationservice.entities.Publication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicationService {
    @Autowired
    PublicationDao publicationDao;

    public List<Publication> findAll(){
        return publicationDao.findAll();
    }

    public Publication addpublication(Publication pub) {
        publicationDao.save(pub);
        return pub;
    }
    public void deletepublication(Long id){
        publicationDao.deleteById(id);
    }

    public Publication updatePublication(Publication m) {
        return publicationDao.saveAndFlush(m);
    }
}
