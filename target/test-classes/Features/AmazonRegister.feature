
  Feature: Amazon Register

    @amazonRegister
    Scenario: User goes to the Registration Page
      Given TC01_User goes to amazon page
      And User goes to registration page by clicking the "Start Here" link
      And User enters a "customername" under Your name
      And User enters a valid "email" under Email
      And User enters a "password" under Password
      And User reenters the "password" Re-enter Password
      Then User clicks the Create your Amazon account button
      Then verify that the user sees the message "Email address already in use"


    #Technical Assigment Aşamaları
    #Amazon ana sayfadaki "Start here" linkine tıklayarak kayıt sayfasına gitmeli.
    #Kayıt sayfasındaki inputları doldurarak kayıt oluşturmalı.
    #Authenticated Required başlıklı sayfaya gelince testin başarılı olduğu doğrulanmalı.
    