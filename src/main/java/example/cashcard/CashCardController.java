package example.cashcard;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cashcards")
 class CashCardController {
    @GetMapping("/cashcards/{requestedId}")
    private ResponseEntity<String> findById(){
        //  CashCard cashCard =new CashCard();
         return  ResponseEntity.ok("{}");
    }
}
