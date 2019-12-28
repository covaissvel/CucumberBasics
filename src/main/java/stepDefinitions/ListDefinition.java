package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Then;

public class ListDefinition {
	
	@Then("user enters the age")
	public void user_enters_the_age(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		List<String> age = dataTable.asList();
	    System.out.println("User enter the age : "+age);
	}


}
