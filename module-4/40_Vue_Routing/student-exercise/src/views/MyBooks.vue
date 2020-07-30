<template>
  <div>
      <reading-list></reading-list>
      <nav>
          <router-link :to="{name: 'add-book'}">Add Book To Reading List</router-link>
      </nav>
  </div>
</template>

<script>
import ReadingList from '@/components/ReadingList';
export default {
    components: {
    ReadingList
}
};
</script>

<style>

</style>