package com.example.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SongDto implements Validator {
    private int id;

    @NotBlank(message = "Name of song not empty")
    @Size(max = 800)
    private String name;

    @NotBlank(message = "Name of artist not empty")
    @Size(max = 300)
    private String artist;

    @NotBlank(message = "Type of music not empty")
    @Size(max = 1000)
    private String typeOfMusic;

    public SongDto() {
    }

    public SongDto(int id, String name, String artist, String typeOfMusic) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.typeOfMusic = typeOfMusic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTypeOfMusic() {
        return typeOfMusic;
    }

    public void setTypeOfMusic(String typeOfMusic) {
        this.typeOfMusic = typeOfMusic;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        SongDto songDto = (SongDto) target;

        if (!songDto.getName().matches("^[\\w\\s]*$")) {
            errors.rejectValue("name", "name.matches", "Name is invalid");
        }
        if (!songDto.getArtist().matches("^[\\w\\s]*$")) {
            errors.rejectValue("artist", "artist.matches", "Artist is invalid");
        }
        if (!songDto.getTypeOfMusic().matches("^[\\w\\s\\,]*$")) {
            errors.rejectValue("typeOfMusic", "typeOfMusic.matches", "Type of music is invalid");
        }
    }
}
