
package com.lexicon.www.services;

import com.lexicon.www.domain.Artist;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface ServiceInterface {

    void addArtist(Artist artist);

    List<Artist> getAllArtists();
    
}
