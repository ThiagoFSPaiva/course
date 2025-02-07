package com.ead.course.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LessonDto {

    @NotBlank
    private String title;

    @NotBlank
    private String description;

    @NotBlank
    private String videoUrl;
}
