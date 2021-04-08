Feature: login functionality
Scenario Outline: Login scenario test for Gmail

Given navigate to Gmail page
When user logged in using username as �<username>� and password as �<password>�
Then home page should be displayed

Examples:
|userName                |Password    |
|DemoDemo@22@gmail.com                |DemoToday    |
