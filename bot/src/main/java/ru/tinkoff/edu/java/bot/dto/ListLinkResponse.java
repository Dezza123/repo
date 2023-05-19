package ru.tinkoff.edu.java.bot.dto;


import java.util.List;

public record ListLinkResponse(List<ru.tinkoff.edu.java.bot.DTO.LinkResponse> links, int size) {}
