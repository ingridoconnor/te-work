import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:3000"
});

export default {

  list() {
    return http.get('/topics');
  },

  get(id) {
    return http.get(`/topics/${id}`);
  },
  addTopic(topics){
    return http.post('/topics', topics);
  },
  deleteTopic(topicID){
    return http.delete(`/topics/${topicID}`);
  }

}
