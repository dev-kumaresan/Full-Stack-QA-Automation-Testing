Feature: Search Facebook and Check its Credentials

  Scenario: Open google and enter facebook and Search Check Meta Section is Displayed.
   Given Launch the "https://www.google.com/" url
   When Search the "facebook" in the search bar
   And click search button, Validate Meta Data Section will be displayed.
   Then Close the browser.
 