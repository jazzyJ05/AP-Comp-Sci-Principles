// Create Variables
var age;
var day;
var discountCode;
var price;
var basePrice;
var weekends;
var weekday;


onEvent("calculateButton", "click", function() {

  //Set the variables for age day and discount
  age = getNumber("ageDropdown");
  console.log("The age is " + age);
  day = getText("dayDropdown");
  console.log("The day is " + day);
  discountCode = getText("discountInput");
  console.log("Discount Code: " + discountCode);

  //When the age is less than 20 the base price will be 5 if not then the basepriceis 10
  if (age <= 18){
    basePrice = 5;
    console.log("my base price is " + basePrice);
  } else {
    basePrice = 10;
    console.log("my base price is" + basePrice);
  }
  
  //If the day is either saturday or sunday it will also be set as a weekend if not it is set as a weekday
  if (day == "Saturday" || day == "Sunday"){
    weekends = true;
    weekday = false;
    console.log("Weekends is " + weekends);
  } else {
    weekends = false;
    weekday = true;
    console.log("Weekends is " + weekends);
  }
  
  //If the day is a weekend the price increase by 5 if not then there is not increase
  if (weekends == true) {
    price = basePrice + 5; 
    console.log("The weekends price is " + price);
  } else {
    price = basePrice + 0;
    console.log("The weekday price is " + price);
  }
  
  //If the discount code freefriday is put and the day is also friday the entire price is removed if not the price stays the same
  if (discountCode == "FREEFRIDAY" && day == "Friday"){
    price = price - price;
    console.log("After discount code the price is " + price);
  } else {
    price = price;
    console.log("After no discount code the price is " + price);
  }
  
  //changes the text to be the price with the dollar sign
  setText("ticketOutput", "Price: " + "$" + price + "\n" + "Age: " + age + "\n" + "Day: " + day);

});
