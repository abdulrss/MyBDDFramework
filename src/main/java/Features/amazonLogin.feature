Feature: As a user I want to search a book and add to basket

Scenario: Validate_Login_To_Amazon_And_Search

Given User is on Amazon home Page
When I search for the book
Then I am retured a list of correct books
When I add the first book to the basket
Then I check the basket total

