// add pageTitle
const title= 'My Shopping List';
// add groceries
let groceries= ["apple", "banana", "carrot", "dog food", "emergen-c", "fish food", "green onions", "hummus", "ice cream", "jelly"];

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  let pageTitle = document.getElementById('title');
  pageTitle.innerText = title;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
    for(let i = 0; i < groceries.length; i++){
      let item =  document.createElement('li');
      item.innerText = groceries[i];
     let parent= document.getElementById('groceries');
      parent.appendChild(item);

    }

}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  let parent= document.getElementById('groceries');
  let child= Array.from(parent.children);
  child.forEach((a) => {
    a.setAttribute('class', 'completed')
  });
  
}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
