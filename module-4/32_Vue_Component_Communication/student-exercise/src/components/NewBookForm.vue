<template>
  <form class="new-book-form" v-on:submit.prevent="addBook()">
      <input class="title-input" type="text" placeholder="Title" v-model="book.title"/>
      <input class="author-input" type="text" placeholder="Author" v-model="book.author"/>
      <input class="isbn-input" type="text" placeholder="ISBN" v-model="book.isbn"/>
      <button>SUBMIT</button>
  </form>
  
</template>

<script>
export default {
data(){
    return{
    book: {
        title: "",
        author: "",
        isbn: "",
        read: false
    }
}
},
methods: {
    addBook(){
        this.$store.commit('ADD_BOOK', this.book);
        this.book = {
        title: "",
        author: "",
        isbn: "",
        read: false
        }
    }
}
}
</script>

<style>

</style>