package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import java.io.IOException;






@Controller
@RequestMapping("/webhook")
public class HelloWorldController {

    @SuppressWarnings("unchecked")
	@RequestMapping(method = RequestMethod.POST)
    public @ResponseBody WebhookResponse webhook(@RequestBody String obj){
        
        return new WebhookResponse("Hello!"+obj, "Text " + obj);
    }//webhookResponse
}
