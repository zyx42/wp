import Vue from "vue";
import App from "./App.vue";
import router from "./router";
import ApolloClient from "apollo-boost";
import VueApollo from 'vue-apollo';

Vue.use(VueApollo);

const apolloClient = new ApolloClient({
    uri: "http://localhost:8081/graphql"
});

const apolloProvider = new VueApollo({
    defaultClient: apolloClient,
    defaultOptions: {
        $loadingKey: "loading"
    }
});


Vue.config.productionTip = false;

new Vue({
    apolloProvider,
    router,
    render: h => h(App)
}).$mount("#app");