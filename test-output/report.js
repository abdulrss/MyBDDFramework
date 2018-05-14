$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Automation Test/MyBDDFrameWork/src/main/java/Features/amazonLogin.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I want to search a book and add to basket",
  "description": "",
  "id": "as-a-user-i-want-to-search-a-book-and-add-to-basket",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate_Login_To_Amazon_And_Search",
  "description": "",
  "id": "as-a-user-i-want-to-search-a-book-and-add-to-basket;validate-login-to-amazon-and-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Amazon home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I search for the book",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I am retured a list of correct books",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I add the first book to the basket",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I check the basket total",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonSearch.user_is_on_Amazon_home_Page()"
});
formatter.result({
  "duration": 10257522078,
  "status": "passed"
});
formatter.match({
  "location": "AmazonSearch.i_search_for_the_book()"
});
formatter.result({
  "duration": 5201503377,
  "status": "passed"
});
formatter.match({
  "location": "AmazonSearch.i_am_retured_a_list_of_correct_books()"
});
formatter.result({
  "duration": 5494184,
  "status": "passed"
});
formatter.match({
  "location": "AmazonSearch.i_add_the_first_book_to_the_basket()"
});
formatter.result({
  "duration": 3393534752,
  "status": "passed"
});
formatter.match({
  "location": "AmazonSearch.i_check_the_basket_total()"
});
formatter.result({
  "duration": 3884849441,
  "status": "passed"
});
});