package com.us.drools.controller;

import com.us.drools.service.RulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/rules")
public class RulesController {

    @Autowired
    private RulesService rulesService;

    @RequestMapping(value ="/write/{id}" ,method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public ResponseEntity<Object> getRuleByWrite(@PathVariable Integer id) {
        return new ResponseEntity<>(rulesService.executeRules(id), HttpStatus.OK);
    }

}
