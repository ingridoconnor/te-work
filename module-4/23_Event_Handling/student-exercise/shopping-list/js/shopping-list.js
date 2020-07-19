let allItemsIncomplete = true;
const pageTitle = 'My Shopping List';
const groceries = [
  { id: 1, name: 'Oatmeal', completed: false },
  { id: 2, name: 'Milk', completed: false },
  { id: 3, name: 'Banana', completed: false },
  { id: 4, name: 'Strawberries', completed: false },
  { id: 5, name: 'Lunch Meat', completed: false },
  { id: 6, name: 'Bread', completed: false },
  { id: 7, name: 'Grapes', completed: false },
  { id: 8, name: 'Steak', completed: false },
  { id: 9, name: 'Salad', completed: false },
  { id: 10, name: 'Tea', completed: false }
];

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const title = document.getElementById('title');
  title.innerText = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const ul = document.querySelector('ul');
  groceries.forEach((item) => {
    const li = document.createElement('li');
    li.innerText = item.name;
    const checkCircle = document.createElement('i');
    checkCircle.setAttribute('class', 'far fa-check-circle');
    li.appendChild(checkCircle);
    ul.appendChild(li);
  });
}
document.addEventListener('DOMContentLoaded', () => {
  setPageTitle();
  displayGroceries();

 const tehe = document.querySelectorAll('ul li');
 tehe.forEach((listItem) => {
    listItem.addEventListener('click', (event) => {
      markComplete(event.target);
    });

    listItem.addEventListener('dblclick', (event) => {
      markIncomplete(event.target);
    });
 });

 const clickThatButton = document.getElementById('toggleAll');
 clickThatButton.addEventListener('click', (event) => {
     markAllComplete(event.target);
   });


});
function markComplete(checked){
  if(!checked.classList.contains('completed')){
    checked.classList.add('completed');
    checked.querySelector('i').classList.add('completed');

  }
}

function markIncomplete(unchecked){
  if(unchecked.classList.contains('completed')){
    unchecked.classList.remove('completed');
    unchecked.querySelector('i').classList.remove('completed');
  }
}


function markAllComplete(allComplete){
  let done = document.querySelectorAll('ul li');
  if(allItemsIncomplete){
    done.forEach((listItem) => {
      markComplete(listItem);
    });
    allItemsIncomplete = false;
    allComplete.innerText = 'Mark All Incomplete';
  } else{
     
      done.forEach((listItem) => {
        markIncomplete(listItem);
      });
      allItemsIncomplete = true;
      allComplete.innerText = 'Mark All Complete';

    }
  }


