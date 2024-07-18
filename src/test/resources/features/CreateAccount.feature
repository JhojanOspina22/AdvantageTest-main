Feature: As user i need sing up in advantage page

  Background: Into the advantage page
    Given User click on the button user menu

  Scenario Outline: validate user Register successfully
    When the user enters "<username>", "<email>", "<password>" and "<confirmpassword>"
    Then the user will see "<username>"
    Examples:
      |username|email|password|confirmpassword|
      |jhojanDU0|jc.kmilo22@gmail.com|Jhojan123|Jhojan123|
      |jhojanDU00|jc.kmilo22@gmail.com|Jhojan123|Jhojan123|
      |jhojanDU000|jc.kmilo22@gmail.com|Jhojan123|Jhojan123|

    @UserRegistered
  Scenario Outline: validate user register with username registered already
    When the user enters "<username>", "<email>", "<password>" and "<confirmpassword>"
    Then the user will see error"<message>"
    Examples:
      |username|email|password|confirmpassword|message|
      |jhojanDU08|jc.kmilo22@gmail.com|Jhojan123|Jhojan123|User name already exists|




