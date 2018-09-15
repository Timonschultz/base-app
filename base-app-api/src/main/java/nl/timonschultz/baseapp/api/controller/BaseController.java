package nl.timonschultz.baseapp.api.controller;

import nl.timonschultz.baseapp.api.model.BaseModel;
import nl.timonschultz.baseapp.api.provider.BaseProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/base")
public class BaseController {

    private BaseProvider baseProvider;

    @Autowired
    public BaseController(BaseProvider baseProvider) {
        this.baseProvider = baseProvider;
    }

    @GetMapping
    public BaseModel getBaseModel() {
        return baseProvider.provideBaseModel();
    }

    @PostMapping
    public BaseModel createBaseModel(@RequestBody final BaseModel baseModel) {
        return baseProvider.provideBaseModel(baseModel.getName(), baseModel.getMessage());
    }

}