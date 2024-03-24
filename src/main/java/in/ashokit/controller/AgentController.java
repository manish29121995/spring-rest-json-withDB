package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Agent;
import in.ashokit.service.AgentService;


@RestController
public class AgentController {
@Autowired

	private AgentService agentService;

@PostMapping("/agent")
   public ResponseEntity<String> createAgentData(@RequestBody Agent agent) {
	   String upsert = agentService.upsert(agent);
	   return new ResponseEntity<String>(upsert, HttpStatus.CREATED);
   }

@GetMapping("/id")
  public ResponseEntity<Agent> getDataById(@RequestParam("id") Integer id) {
	  Agent byId = agentService.getById(id);
	     return new ResponseEntity<Agent>(byId, HttpStatus.OK);
	  
  }

@GetMapping("/all/data")
       public ResponseEntity<List<Agent>> getAllAgentData() {
    	   List<Agent> allAgent = agentService.getAllAgent();
    	   return new ResponseEntity<List<Agent>>(allAgent, HttpStatus.OK);
    	   
       }
@DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteData(@PathVariable Integer id) {
             String status = agentService.deleteById(id);
             return new ResponseEntity<String>(status, HttpStatus.ACCEPTED);
}

@PutMapping("/update")
public ResponseEntity<String> updateData(@RequestBody Agent agent) {
	String string = agentService.upsert(agent);
	     return new ResponseEntity<String>(string, HttpStatus.OK);
	
}
}