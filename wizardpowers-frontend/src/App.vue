<template>
  <main id="app">
    <div class="container">
    <nav class="navbar navbar-dark bg-dark navbar-expand-md">
      <div class="container-fluid">
        <div>
          <ul class="nav navbar-nav">
            <router-link class="nav-item" v-bind:to="'wizards'"><a class="nav-link">WIZARDS</a></router-link>
            <router-link class="nav-item" v-bind:to="'wizard-add'"><a class="nav-link">ADD WIZARD</a></router-link>
          </ul>
        </div>
      </div>
    </nav>
    <div class="row">
      <div class="col-12 jumbotron">
        <transition name="slide" mode="out-in">
          <router-view />
        </transition>
      </div>
    </div>
    </div>
  </main>
</template>

<script>
export default {
  name: 'app'
};
</script>

<style>
  body {
    padding: 30px;
  }

  .slide-enter-active {
    animation: slide-in 200ms ease-out forwards;
  }

  .slide-leave-active {
    animation: slide-out 200ms ease-out forwards;
  }

  @keyframes slide-in {
    from {
      transform: translateY(-30px);
      opacity: 0;
    }
    to {
      transform: translateY(0);
      opacity: 1;
    }
  }

  @keyframes slide-out {
    from {
      transform: translateY(0);
      opacity: 1;
    }
    to {
      transform: translateY(-30px);
      opacity: 0;
    }
  }
</style>
