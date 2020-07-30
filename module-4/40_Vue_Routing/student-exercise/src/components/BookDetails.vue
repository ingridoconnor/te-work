<template>
  <div class="card" v-bind:class="{ read: book.read }">
    <h2 class="book-title">{{ book.title }}</h2>
    <h2 class="book-author">{{ book.author }}</h2>
    <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
        <p class="read-or-unread-message" v-if="book.read">I have read this book</p>
          <p class="read-or-unread-message" v-if="!book.read">I have read this book</p>
</template>

<script>
export default {
name:  'book-details',
computed:{
    book(){

       
        return this.$store.state.books.find((bookObj) => 
        bookObj.isbn == this.$route.params.isbn
        );
        
    }
}

}
</script>

<style>

</style>