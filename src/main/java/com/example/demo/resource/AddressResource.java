package com.example.demo.resource;

import com.example.demo.dto.AddressDto;
import com.example.demo.interfaces.IResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/address")
public class AddressResource implements IResource<AddressDto, Integer> {

    @Override
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public AddressDto create(@RequestBody AddressDto entity) {
        return null;
    }


    @Override
    @GetMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public AddressDto get(@PathVariable Integer id) {
        return null;
    }

    @Override
    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public List<AddressDto> get() {
        return List.of();
    }

    @Override
    @PutMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public AddressDto update(@PathVariable Integer id, @RequestBody AddressDto entity) {
        return null;
    }

    @Override
    @DeleteMapping(
        value = "/{id}"
    )
    public void delete(@PathVariable Integer id) {

    }
}
