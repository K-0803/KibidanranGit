package com.example.demo.form;

// import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppsForm {
    // @NotBlank
    private String viewFacility;
    private String viewType;
    
}
