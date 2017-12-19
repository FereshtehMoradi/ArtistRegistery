
package com.lexicon.www.controller;

import com.lexicon.www.domain.Artist;
import com.lexicon.www.services.ServiceInterface;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class ArtistController {
    private String name;
    private String occupation;
    private int age;
    
    @Inject
    ServiceInterface serviceIntf;
    
    public void submit(){
        Artist a1 = new Artist(age,name,occupation);
        serviceIntf.addArtist(a1);
    }
    public List<Artist> getAllArtists(){
       return  serviceIntf.getAllArtists();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
}
