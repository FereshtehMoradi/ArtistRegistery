
package com.lexicon.www.services;

import com.lexicon.www.domain.Artist;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ArtistDow implements ServiceInterface {
    @PersistenceContext
    EntityManager em;
    
    @Override
    public void addArtist(Artist artist){
    em.persist(artist);
    
    }
    @Override
    public List<Artist> getAllArtists(){
         return em.createQuery("Select a from Artist a").getResultList();
    
    }

    
}
