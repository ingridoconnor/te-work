<template>
  <div class="book-container">

<book-card v-for="currentBook in $store.state.books" v-bind:book="currentBook" v-bind:key="currentBook.title"/>

  </div>
</template>

<script>

  import BookCard from './BookCard';
export default {
    name: 'reading-list',
    components:{
      BookCard
    }
};
</script>

<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>