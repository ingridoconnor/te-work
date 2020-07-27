const todoList = document.getElementById('todos');

let todos = [];
let pageTitle = '';

function init() {
    pageTitle = 'My Morning Routine';
todos = [
    { id: 1, task: '1', completed: false },
    { id: 2, task: '2', completed: false },
    { id: 3, task: '3', completed: false },
    { id: 4, task: '4', completed: false },
    { id: 5, task: '5', completed: false },
    { id: 6, task: '6', completed: false }
  ]
}



function addPageTitle() {
    const heading = document.createElement('h1')
    heading.innerText = pageTitle;
    todoList.appendChild(heading);
  }
  function addTodos() {
    const ul = document.createElement('ul');
    todos.forEach(todo => {
      const li = document.createElement('li')
      li.innerText = todo.task
      ul.appendChild(li)
    });
    todoList.appendChild(ul);
  }

  init();
  addPageTitle();
