import Vue from "vue";
import App from "./App.vue";
import router from "./router";
import { ApolloClient } from "apollo-client";
import { HttpLink } from "apollo-link-http";
import { InMemoryCache } from "apollo-cache-inmemory";
import VueApollo from 'vue-apollo';

Vue.use(VueApollo);

const apolloClient = new ApolloClient({
    link: new HttpLink({
        uri: 'http://localhost:8081/graphql',
    }),
    cache: new InMemoryCache(),
});

const apolloProvider = new VueApollo({
    defaultClient: apolloClient,
});


Vue.config.productionTip = false;

new Vue({
    provide: apolloProvider,
    router,
    render: h => h(App)
}).$mount("#app");