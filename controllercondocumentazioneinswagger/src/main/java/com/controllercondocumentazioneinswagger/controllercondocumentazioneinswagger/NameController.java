package com.controllercondocumentazioneinswagger.controllercondocumentazioneinswagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
@Api(tags = "NameController", description = "Operazioni sul nome")
@RestController
@RequestMapping("/v2")
public class NameController {

    @ApiOperation("Restituisci il nome")
    @GetMapping("/name")
    public String getName(@RequestParam String name){
        return "Name: " + name;
    }

    @ApiOperation("Restituisci il nome al contrario")
    @PostMapping("reverse-name")
    public String postName(@RequestParam String name){
        StringBuilder reverseName = new StringBuilder(name).reverse();
        return "Reserve Name: " + reverseName;
    }

}
