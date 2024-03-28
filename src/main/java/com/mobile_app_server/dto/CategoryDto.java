package com.mobile_app_server.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;

@Getter
@Setter
@CrossOrigin
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tblCategory")
public class CategoryDto {
    @Id
    private Integer id;
    private String name;
    private String des;

    public CategoryDto(ResultSetQuery resultSetQuery) {
        this.name = resultSetQuery.getCatename();
    }
}