
<template>
  <div class="main">
      <h2>Product Reviews for {{ name }}</h2>
      <p class = "description">{{ description }}</p>

      <div class="review" v-for="review in reviews" v-bind:key="review.id">
          <h4>{{review.reviewer}}</h4>
          <div class="rating">
              <img src="../assets/star.png" v-bind:title="review.rating + ' Star Review'" class="rating-star" v-for="n in review.rating" v-bind:key="n"/>
          </div>
          <h4> {{review.title}}</h4>
          <p> {{review.review}}</p>

      </div>

      </div>


</template>

<script>

export default {
    data() {
        return {
            name: "Cigar Party for Dummies",
            description: "Host and plan a perfect Cigar Party for all your squirrely friends",
            reviews: [
                {
                    reviewer: "Rowdy Randy",
                    title: "Great Read",
                    review: "Best book on cigars ever!",
                    rating: 4
                },
                {
                    reviewer: "Mary Randy",
                    title: "Great Paper Weight",
                    review: "The whole house stinks, thanks Randy!",
                    rating: 1
                }
            ]
        },
        computed: {
            averageRating(){
                let sum = this.reviews.reduce((currentSum, review) => {
                    return currentSum + review.rating;
                }, 0);
                return sum / this.reviews.length;
            }
            numberOfOneStarReview(){
                return this.reviews.reduce((currentSum, review) => {
                    return currentSum + (review.rating == 1);
                }, 0);
            
            }
        }
    }

}
</script>

<style>
div.main {
    margin: 1rem 0;
}

div.rating-star {
    height: .75em ;
}

</style>