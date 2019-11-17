FROM node:lts-alpine as build-stage
WORKDIR /app
COPY . .
RUN npm install && npm install vue-apollo vue-router apollo-link-http apollo-cache-inmemory apollo-client graphql graphql-tag && npm run build

FROM nginx:stable-alpine
COPY --from=build-stage /app/dist /usr/share/nginx/html
COPY nginx/nginx.conf /etc/nginx/nginx.conf
EXPOSE 7777
CMD ["nginx", "-g", "daemon off;"]
