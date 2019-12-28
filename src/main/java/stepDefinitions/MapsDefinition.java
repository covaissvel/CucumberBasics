package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Then;

public class MapsDefinition {
	
	@Then("user enters the age category")
	public void user_enters_the_age_category(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		List<Map<String, String>> ageCategory = dataTable.asMaps(String.class, String.class);
		System.out.println("user entered the age : "+ageCategory.get(0).get("age") + "and location is :"+ageCategory.get(0).get("location"));
	}

}
