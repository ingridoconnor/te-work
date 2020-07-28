<template>
  <div class="card">

   <h1 class="book-title"> {{book.title}} </h1>
    <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
    <h2 class="book-author"> {{book.author}} </h2>
    <button  v-bind:class="book.read ? 'mark-unread' : 'mark-read'"
    v-on:click.prevent="setRead(book)"
    >Mark{{book.read ? 'Unread' : 'Read'}}</button>
  </div>
</template>

<script>
export default {
    name: 'book-card',
    props: {
        book: Object
    },
    methods: {
        setRead(book){
        this.$store.commit('TOGGLE_READ', book);
        }
    }
}
</script>

<style>
.card {
    border: 2px solid black;
    border-radius: 10px;
    width: 250px;
    height: 550px;
    margin: 20px;
}

.card.read {
    background-color: lightgray;
}

.card .book-title {
    font-size: 1.5rem;
}

.card .book-author {
    font-size: 1rem;
}
</style>